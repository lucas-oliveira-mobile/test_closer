package br.com.lucasoliveira.codigospostais.models

data class PostalCodes(
    var codState: String?,
    var codCity: String?,
    var codLocalidade: String?,
    var nameLocalidade: String?,
    var codArteria: String,
    var typeArteria: String,
    var firstPrep: String,
    var titleArteria: String,
    var secondPrep: String,
    var desigArteria: String,
    var localArteria: String,
    var troco: String,
    var door: String,
    var client: String,
    var codPostal: String?,
    var postalExtencion: String?,
    var postalDesignation: String?

)
