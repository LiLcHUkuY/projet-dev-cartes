package org.sio.slam.devine.enum

/**
 * Noms des cartes, avec leur valeur de points
 */
enum class NomCarte(val points: Int) {
    DEUX(2),
    TROIS(3),
    QUATRE(4),
    CINQ(5),
    SIX(6),
    SEPT(7),
    HUIT(8),
    NEUF(9),
    DIX(10),
    VALET(11),
    DAME(12),
    ROI(13),
    AS(14)
}

/**
 * Obtient une instance de NomCarte à partir d'une chaine de caractères ou null si non trouvé
 * Voir aussi
 * @see https://stackoverflow.com/questions/41844080/kotlin-how-to-check-if-enum-contains-a-given-string-without-messing-with-except
 */
fun getNomCarteFromString(unNomCarte: String): NomCarte? {
    // les valeurs de NomCarte sont des instances de NomCarte
    // nomCarte représente la variable de boucle utilisée par la boucle for
    // vérifie si l'élément courant a son nom qui correspond avec la valeur du paramètre
    for (nomCarte in NomCarte.values()) {
        if (nomCarte.name == unNomCarte) {
            return nomCarte
        }
    }
    return null
}
