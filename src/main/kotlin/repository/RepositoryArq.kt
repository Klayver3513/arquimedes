package repository

import org.springframework.stereotype.Component
import java.util.concurrent.ThreadLocalRandom

@Component
class RepositoryArq {
    var contador = 1
    var numAleatorio: Int = 0

    fun gerarNumeroAleatorio(intervaloInicial: Int, intervaloFinal: Int, qtdNumeros: Int): List<Int> {
        val listaDeNumeros = mutableListOf<Int>()
        while (contador <= qtdNumeros) {
            numAleatorio = ThreadLocalRandom.current().nextInt(intervaloInicial, intervaloFinal)
            listaDeNumeros.add(numAleatorio)
            contador++
        }
        return listaDeNumeros
    }
}