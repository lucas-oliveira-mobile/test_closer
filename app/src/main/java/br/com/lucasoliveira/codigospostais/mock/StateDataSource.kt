package br.com.lucasoliveira.codigospostais.mock

import br.com.lucasoliveira.codigospostais.models.States

class StateDataSource {

    companion object {

        fun creationDataSet(): ArrayList<States> {

            val list = ArrayList<States>()

            list.add (

                States(
                    codDistrito = "1",
                    distritoDesignation = "Aveiro"
                )
            )

            list.add (

                States(
                    codDistrito = "2",
                    distritoDesignation = "Beja"
                )
            )

            list.add (

                States(
                    codDistrito = "3",
                    distritoDesignation = "Braga"
                )
            )

            list.add (

                States(
                    codDistrito = "4",
                    distritoDesignation = "Bragança"
                )
            )

            list.add (

                States(
                    codDistrito = "5",
                    distritoDesignation = "Castelo Branco"
                )
            )

            list.add (

                States(
                    codDistrito = "6",
                    distritoDesignation = "Coimbra"
                )
            )

            list.add (

                States(
                    codDistrito = "7",
                    distritoDesignation = "Évora"
                )
            )

            list.add (

                States(
                    codDistrito = "8",
                    distritoDesignation = "Faro"
                )
            )

            list.add (

                States(
                    codDistrito = "9",
                    distritoDesignation = "Guarda"
                )
            )

            list.add (

                States(
                    codDistrito = "10",
                    distritoDesignation = "Leiria"
                )
            )

            list.add (

                States(
                    codDistrito = "11",
                    distritoDesignation = "Lisboa"
                )
            )

            list.add (

                States(
                    codDistrito = "12",
                    distritoDesignation = "Portalegre"
                )
            )

            list.add (

                States(
                    codDistrito = "13",
                    distritoDesignation = "Porto"
                )
            )

            list.add (

                States(
                    codDistrito = "14",
                    distritoDesignation = "Santarém"
                )
            )

            list.add (

                States(
                    codDistrito = "15",
                    distritoDesignation = "Setúbal"
                )
            )

            list.add (

                States(
                    codDistrito = "16",
                    distritoDesignation = "Viana do Castelo"
                )
            )

            list.add (

                States(
                    codDistrito = "17",
                    distritoDesignation = "Vila Real"
                )
            )

            list.add (

                States(
                    codDistrito = "18",
                    distritoDesignation = "Viseu"
                )
            )

            list.add (

                States(
                    codDistrito = "31",
                    distritoDesignation = "Ilha da Madeira"
                )
            )

            list.add (

                States(
                    codDistrito = "32",
                    distritoDesignation = "Ilha de Porto Santo"
                )
            )

            list.add (

                States(
                    codDistrito = "41",
                    distritoDesignation = "Ilha de Santa Maria"
                )
            )

            list.add (

                States(
                    codDistrito = "42",
                    distritoDesignation = "Ilha de São Miguel"
                )
            )

            list.add (

                States(
                    codDistrito = "43",
                    distritoDesignation = "Ilha Terceira"
                )
            )

            list.add (

                States(
                    codDistrito = "44",
                    distritoDesignation = "Ilha da Graciosa"
                )
            )

            list.add (

                States(
                    codDistrito = "45",
                    distritoDesignation = "Ilha de São Jorge"
                )
            )

            list.add (

                States(
                    codDistrito = "46",
                    distritoDesignation = "Ilha do Pico"
                )
            )

            list.add (

                States(
                    codDistrito = "47",
                    distritoDesignation = "Ilha do Faial"
                )
            )

            list.add (

                States(
                    codDistrito = "48",
                    distritoDesignation = "Ilha das Flores"
                )
            )

            list.add (

                States(
                    codDistrito = "49",
                    distritoDesignation = "Ilha do Corvo"
                )
            )

            return list
        }
    }
}