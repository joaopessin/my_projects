import random

lower = 'abcdefghijklmnopqrstuvwxyz'
upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
num = '0123456789'
sym = '!@#$%&'

all = lower + upper + num + sym
length = 9
password = "".join(random.sample(all, length))

print('The password you generated is: ', password)