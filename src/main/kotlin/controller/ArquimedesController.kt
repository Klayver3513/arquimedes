package controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired
import repository.RepositoryArq
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/arquimedesMatematica")
@CrossOrigin("*")
 class ArquimedesController{
    @Autowired
    private lateinit var solucoesArq: RepositoryArq

    @GetMapping ("/numerosAleatorios/quantidadeNumeros={qtdNumeros}/intervaloInicial={intervaloInicial}/intervaloFinal={intervaloFinal}")
    fun numAleatorio (@PathVariable qtdNumeros:  Int,
                      @PathVariable intervaloInicial: Int,
                      @PathVariable intervaloFinal: Int): List<Int>
    {
        return solucoesArq.gerarNumeroAleatorio(intervaloInicial, intervaloFinal, qtdNumeros)
    }
}