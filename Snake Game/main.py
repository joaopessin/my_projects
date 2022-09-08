import pygame
from pygame.locals import *
from random import randint

def on_grid_random():
    x = randint(0, 590)
    y = randint(0, 590)

    return (x // 10 * 10, y // 10 * 10)

def collision(c1, c2):
    return (c1[0] == c2[0]) and (c1[1] == c2[1])

UP = 0
RIGHT = 1
DOWN = 2
LEFT = 3

pygame.init()

screen = pygame.display.set_mode((600, 600))
pygame.display.set_caption('Snake Game')

snake = [(300, 300), (310, 300), (320, 300)]
snake_skin = pygame.Surface((10, 10))
snake_skin.fill((255, 255, 255))

apple_pos = on_grid_random()
apple = pygame.Surface((10, 10))
apple.fill((255, 0, 0))

my_direction = LEFT

clock = pygame.time.Clock()

game_over = False

# ----- > Loop to Pin the Screen <-----
while True:
    clock.tick(20)

    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()

    # ----- > Steering Control <-----
    if event.type == KEYDOWN:
        if event.key == K_UP and my_direction != DOWN:
            my_direction = UP
        if event.key == K_RIGHT and my_direction != LEFT:
            my_direction = RIGHT
        if event.key == K_DOWN and my_direction != UP:
            my_direction = DOWN
        if event.key == K_LEFT and my_direction != RIGHT:
            my_direction = LEFT
    
    # -----> When the Snake "Eats" the Apple <-----
    if collision(snake[0], apple_pos):
        apple_pos = on_grid_random()
        snake.append((0, 0))
    
    # -----> Collision with Limits <-----
    if snake[0][0] == 600 or snake[0][1] == 600 or snake[0][0] < 0 or snake[0][1] < 0:
        game_over = True
        break
    
    # -----> Collision with Itself <-----
    for i in range(1, len(snake) - 1):
        if snake[0][0] == snake[i][0] and snake[0][1] == snake[i][1]:
            game_over = True
            break

    if game_over:
        break
    
    # ----- > Body Direction Reference <-----
    for i in range(len(snake) - 1, 0, -1):
        snake[i] = (snake[i - 1][0], snake[i - 1][1])

    # ----- > Head Direction Reference <-----
    if my_direction == UP:
        snake[0] = (snake[0][0], snake[0][1] - 10)
    if my_direction == RIGHT:
        snake[0] = (snake[0][0] + 10, snake[0][1])
    if my_direction == DOWN:
        snake[0] = (snake[0][0], snake[0][1] + 10)
    if my_direction == LEFT:
        snake[0] = (snake[0][0] - 10, snake[0][1])
    
    screen.fill((0, 0, 0))
    screen.blit(apple, apple_pos)

    for pos in snake:
        screen.blit(snake_skin, pos)
    
    pygame.display.update()
