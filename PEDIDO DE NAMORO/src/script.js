const perguntas = [
    { pergunta: "Qual o meu carro dos sonhos?", opcoes: ["911 GT3 RS", "M4 Competition", "Carrera GT", "TODOS KKKK"], resposta: "TODOS KKKK" },
    { pergunta: "Qual a minha série preferida?", opcoes: ["The Walking Dead", "Cobra Kai", "Arrow", "Flash"], resposta: "The Walking Dead" },
    { pergunta: "Quem eu prefiro?", opcoes: ["Cbum", "Ramon", "URS", "Ruf Disel"], resposta: "Cbum" },
    { pergunta: "Qual a minha comida preferida?", opcoes: ["Pizza", "Hambúrguer", "Sushi", "Lasanha"], resposta: "Hambúrguer" },
    { pergunta: "Posso tomar bomba?", opcoes: ["Sim", "Sim"], resposta: "Sim" },
    { pergunta: "O que eu mais amo em você?", opcoes: ["Sorriso", "Cabelo", "Olhar", "Tudo porque você é perfeita"], resposta: "Tudo porque você é perfeita" }
];

let perguntaAtual = 0;

const questionDiv = document.getElementById("perguntas");
const optionsDiv = document.getElementById("opcoes");
const pedidoContainer = document.getElementById("pedido-container");
const pedidoTexto = document.getElementById("pedido-texto");
const rosasCoracoesDiv = document.getElementById("rosas-coracoes");

function mostrarPergunta() {
    const p = perguntas[perguntaAtual];
    questionDiv.textContent = p.pergunta;
    optionsDiv.innerHTML = ""; // Limpa as opções anteriores
    p.opcoes.forEach(opcao => {
        const button = document.createElement("button");
        button.textContent = opcao;
        button.onclick = () => verificarResposta(opcao);
        optionsDiv.appendChild(button);
    });
}

function verificarResposta(opcaoEscolhida) {
    if (opcaoEscolhida === perguntas[perguntaAtual].resposta) {
        perguntaAtual++;
        if (perguntaAtual < perguntas.length) {
            mostrarPergunta();
        } else {
            mostrarPedido();
        }
    }
}

function mostrarPedido() {
    const quizContainer = document.getElementById("quiz-container");
    quizContainer.style.display = "none";
    pedidoContainer.style.display = "block";
    pedidoTexto.textContent = "Você aceita me fazer o homem mais feliz do mundo para sempre?";

    // Criação dinâmica de rosas e corações (exemplo):
    for (let i = 0; i < 2; i++) {
        const rosa = document.createElement("div");
        rosa.classList.add("rosa");
        rosasCoracoesDiv.appendChild(rosa);

        const coracao = document.createElement("div");
        coracao.classList.add("coracao");
        rosasCoracoesDiv.appendChild(coracao);
    }

    // Animação das Rosas e Corações
    const rosas = document.querySelectorAll('.rosa');
    const coracoes = document.querySelectorAll('.coracao');

    rosas.forEach((rosa, index) => {
        setTimeout(() => {
            rosa.style.animation = 'aparecer 1s ease-out, girar 10s linear infinite'; // Animação de entrada e giro contínuo
            rosa.style.animationDelay = `${index * 0.1}s`; 
        }, index * 100);
    });

    coracoes.forEach((coracao, index) => {
        setTimeout(() => {
            coracao.style.animation = 'aparecer 1s ease-out, pulsar 2s ease-in-out infinite'; // Animação de entrada e pulsação contínua
            coracao.style.animationDelay = `${index * 0.1}s`; 
        }, index * 100);
    });

    // Animação do Texto do Pedido
    pedidoTexto.style.opacity = 0; // Começa invisível
    setTimeout(() => {
        pedidoTexto.style.transition = 'opacity 1s ease-in'; // Transição suave
        pedidoTexto.style.opacity = 1; // Torna visível
    }, 1000); // Aparece após 1 segundo (depois das rosas e corações)
}

// Função para mostrar texto aleatório após aceitar o pedido
function mostrarTextoAleatorio() {
    const textos = [
        "Amor, muito obrigado por me fazer feliz todos os dias, minha princesa. Você foi a melhor coisa que aconteceu na minha vida. Você me faz ser uma pessoa melhor todos os dias. Você é a resposta mais linda das minhas orações. Você me tirou da escuridão. Muito obrigado por me salvar dela e por continuar a me tirar dela a cada segundo. Você não tem ideia do tamanho do meu amor por você. Você é o meu primeiro amor, a primeira mulher para quem dei flores e a primeira mulher com quem estou namorando. Você é a primeira mulher para quem dei presentes e será a última também. Muito obrigado por me ensinar como o amor é maravilhoso e como a vida é linda. Mas a vida só é linda se eu estiver com você, porque você trouxe cor ao cinza em que eu vivia. No futuro, quando tivermos nossa família formada, irei contar para nossa filha como nosso amor foi lindo e como você foi a pessoa que me ajudou a chegar onde cheguei. Também vou falar para ela como você me salvou todos os dias e sempre me apoiou em tudo. Você é essa pessoa maravilhosa, meiga, companheira e cuidadosa. Eu só tenho a te agradecer, meu amor. Eu te amo e vou te amar para sempre! "
    ];
    const textoAleatorio = textos[Math.floor(Math.random() * textos.length)];
    pedidoTexto.textContent = textoAleatorio;

    document.getElementById("sim-button").style.display = "none";
    document.getElementById("nao-button").style.display = "none";
    document.getElementById("foto").style.display = "none";
    document.getElementById("rosas-coracoes").style.display = "none";
}

document.getElementById("sim-button").onclick = mostrarTextoAleatorio;
document.getElementById("nao-button").onclick = () => {
    pedidoTexto.textContent = "Tudo bem, talvez outra hora.";
};

// Inicia o quiz mostrando a primeira pergunta
mostrarPergunta();