var boasVindas = "Bem-vindo(a) ";
var nomeAluno = "João Vitor";

var primeiraNotaAluno = 7.5;
var segundaNotaAluno = 5;
var terceiraNotaAluno = 8.125;
var quartaNotaAluno = 6;
var quantidadeNotasAluno = 4;

var somaNotasAluno = primeiraNotaAluno + segundaNotaAluno + terceiraNotaAluno + quartaNotaAluno;
var notaFinalAluno = somaNotasAluno / quantidadeNotasAluno;

console.log(boasVindas + nomeAluno + "!");
console.log("Sua nota final é: " + notaFinalAluno.toFixed(2));  // .toFixed(): exibe o valor até a quantidade de casas decimais escolhida.