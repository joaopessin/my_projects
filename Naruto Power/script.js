const frase = document.querySelector("#frase");
const botao = document.querySelector("#botao");
const frasesProntas = [
  "Trabalho duro é inútil para aqueles que não acreditam em si mesmos - Uzumaki Naruto",
  "Lar é onde tem alguém sempre pensando em você - Uzumaki Naruto",
  "Desista de me fazer desistir - Uzumaki Naruto",
  "Aqueles que não entendem a verdadeira dor nunca vão entender a verdadeira paz - Pain",
  "Quando eu não tinha nada nem ninguém, eu tinha a dor - Pain",
  "Quando um homem aprende a amar, ele deve suportar o risco de ser odiado - Uchiha Madara",
  "Se você se concentrar em algo, poderá fazer qualquer coisa - Uchiha Madara",
  "Ninguém se importava com quem eu era até eu colocar uma máscara - Uchiha Obito",
  "No momento em que as pessoas passam a conhecer o amor, elas também correm o risco de carregar o ódio - Uchiha Obito",
  "Saber o que é certo e escolher ignorá-lo é um ato de covardia - Hatake Kakashi",
  "Na sociedade, aqueles que não possuem muitas habilidades, tendem a reclamar mais - Hatake Kakashi",
  "Às vezes eu gostaria de ser apenas uma nuvem, flutuando - Nara Shikamaru",
  "Não é porque eu sou preguiçoso é porque eu não me importo - Nara Shikamaru"
]

function montaFrase() {
  frase.style.opacity = 1;
  botao.setAttribute("disabled", true);

  const numeroAleatorio = Math.floor(Math.random() * frasesProntas.length);

  frase.innerHTML = frasesProntas[numeroAleatorio];

  setTimeout(function apagaFrase() { frase.style.opacity = 0; botao.removeAttribute("disabled"); }, 4000);
}