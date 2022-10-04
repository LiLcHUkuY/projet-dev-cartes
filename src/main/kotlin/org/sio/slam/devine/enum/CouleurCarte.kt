package org.sio.slam.devine.enum

import java.lang.IllegalArgumentException

/**
 * Implémentation à minima
 */
enum class CouleurCarte(val points: Int) {
    TREFLE(1), PIQUE(2), CARREAU(3), COEUR(4)
}

/**
 * Obtient une instance de CouleurCarte à partir d'une chaine de caractères ou null si non trouvé
 * Voir aussi
 * @see <a href="https://stackoverflow.com/questions/41844080/kotlin-how-to-check-if-enum-contains-a-given-string-without-messing-with-except">check enum stackoverflow</a>
 */
fun getCouleurCarteFromString(unNomDeCouleur: String): CouleurCarte? {
    // les valeurs de CouleurCarte sont des instances de CouleurCarte
    // couleurCarte est une variable de boucle ici, algorithme classique
    for (couleurCarte in CouleurCarte.values()) {
        if (couleurCarte.name == unNomDeCouleur) {
            return couleurCarte
        }
    }
    return null
}

// autre solution
//try {
//    return enumValueOf<CouleurCarte>(unNomDeCouleur)
//} catch (e :IllegalArgumentException) {
//    return null
//}
