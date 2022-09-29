package org.sio.slam.devine

import org.sio.slam.devine.core.Carte
import org.sio.slam.devine.core.Jeu
import org.sio.slam.devine.core.Paquet
import org.sio.slam.devine.enum.CouleurCarte
import org.sio.slam.devine.enum.NomCarte
import org.sio.slam.devine.enum.getCouleurCarteFromString
import org.sio.slam.devine.enum.getNomCarteFromString
import org.sio.slam.devine.fabrique.createJeu32Cartes

fun main(args: Array<String>) {

    val aide = false
    // TODO (A) demander au joueur s'il souhaite avoir de l'aide pour sa partie

    println("Création d'un paquet de 32 cartes")
    val paqueDeCartes = Paquet(createJeu32Cartes())
    // TODO (A) demander au joueur avec quel jeu de cartes 32 ou 52 il souhaite jouer

    println(" ==== Instanciation du jeu, début de la partie. ====")
    val jeu = Jeu(aide, paqueDeCartes)

    println("Entrez un nom de carte dans le jeu (exemples : Roi, sept, six, As...) :")
    // TODO (optionnel) permettre de saisir un chiffre au lieu d'une chaine : 7 au lieu de Sept...
    val nomCarteUserStr: String = readLine() + ""
    val nomCarteUser: NomCarte? = getNomCarteFromString(nomCarteUserStr.trim().uppercase())

    println("Entrez un nom de \"couleur\" de carte parmi : Pique, Trefle, Coeur, Carreau : ")
    val couleurCarteUserStr: String = readLine() + ""
    val couleurCarteUser: CouleurCarte? = getCouleurCarteFromString(couleurCarteUserStr.trim().uppercase())

    if (nomCarteUser != null && couleurCarteUser != null) {
        // prise en compte de la carte du joueur
        val carteDuJoueur: Carte = Carte(nomCarteUser, couleurCarteUser)

        if (jeu.isMatch(carteDuJoueur)) {
            println("Bravo, vous avez trouvé la bonne carte !")
        } else {
            println("Ce n'est pas la bonne carte !")
            println("votre proposition  : $carteDuJoueur")
            if (aide) {
                // TODO: (A) si l'aide est activée, alors dire si la carte proposée est
                //  plus petite ou plus grande que la carte à deviner
            }
        }
    } else {
        // utilisateur a mal renseigné sa carte
        val nomCarte = if (nomCarteUserStr == "") "?" else nomCarteUserStr
        val couleurCarte = if (couleurCarteUserStr == "") "?" else couleurCarteUserStr

        println("Désolé, mauvaise définition de carte ! (${nomCarte} de ${couleurCarte})")
    }

    // TODO (A) permettre au joueur de retenter une autre carte (sans relancer le jeu) ou d'abandonner la partie
    println(" ==== Fin prématurée de la partie ====")

    // TODO (A) Présenter à la fin la carte à deviner
    println("TODO Présenter ici la carte à deviner")

    // TODO (challenge-4) la stratégie de jeu est à implémenter... à faire lorsque les autres TODOs auront été réalisés
    println("Votre stratégie de jeu : ${jeu.strategiePartie()} ")

    println(" ==== Fin de la partie. ====")
}
