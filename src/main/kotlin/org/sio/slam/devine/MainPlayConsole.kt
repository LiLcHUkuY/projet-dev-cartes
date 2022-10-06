package org.sio.slam.devine

import org.sio.slam.devine.core.Carte
import org.sio.slam.devine.core.Jeu
import org.sio.slam.devine.core.Paquet
import org.sio.slam.devine.enum.CouleurCarte
import org.sio.slam.devine.enum.NomCarte
import org.sio.slam.devine.enum.getCouleurCarteFromString
import org.sio.slam.devine.enum.getNomCarteFromString
import org.sio.slam.devine.fabrique.createJeu32Cartes
import org.sio.slam.devine.fabrique.createJeu52Cartes

fun main(args: Array<String>) {

    // TODO (A) demander au joueur s'il souhaite avoir de l'aide pour sa partie
    val aide: Boolean
    println("Souhaitez-vous avoir de l'aide durant la partie ? oui ou non")
    val wantAide : String = readLine() + ""
    aide = wantAide == "oui"
    if (wantAide == "oui") {
        println("L'aide est activée")
    }
    else {
        println("L'aide est désactivée")
    }


    // TODO (A) demander au joueur avec quel jeu de cartes 32 ou 52 il souhaite jouer
    val paquetDeCartes: Paquet
    println("Souhaitez-vous avoir un paquet de 32 ou 52 cartes ?")
    val choixPaquet : String = readLine() + ""

    if (choixPaquet == "32") {
        println("Création d'un paquet de 32 cartes")
        paquetDeCartes = Paquet(createJeu32Cartes())
    }
    else {
        println("Création d'un paquet de 52 cartes")
        paquetDeCartes = Paquet(createJeu52Cartes())
    }


    println(" ==== Instanciation du jeu, début de la partie. ====")
    val jeu = Jeu(aide, paquetDeCartes)

    do{
        var repeat = 0
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

            //val carteADeviner: Carte = Carte()

            if (jeu.isMatch(carteDuJoueur)) {
                println("Bravo, vous avez trouvé la bonne carte !")
                repeat = 1
            } else {
                println("Ce n'est pas la bonne carte !")
                println("votre proposition  : $carteDuJoueur")
                if (aide) {
                    // TODO: (A) si l'aide est activée, alors dire si la carte proposée est
                    //  plus petite ou plus grande que la carte à deviner
                    jeu.help(carteDuJoueur)
                }
                println("Souhaitez-vous continuer la partie ? oui ou non")
                var continuer: String = readLine() + ""
                repeat = if (continuer == "oui") {
                    0
                } else {
                    1
                }
            }
        } else {
            // utilisateur a mal renseigné sa carte
            val nomCarte = if (nomCarteUserStr == "") "?" else nomCarteUserStr
            val couleurCarte = if (couleurCarteUserStr == "") "?" else couleurCarteUserStr

            println("Désolé, mauvaise définition de carte ! (${nomCarte} de ${couleurCarte})")
        }
    }while (repeat != 1)



    // TODO (A) permettre au joueur de retenter une autre carte (sans relancer le jeu) ou d'abandonner la partie


    //println(" ==== Fin prématurée de la partie ====")

    // TODO (A) Présenter à la fin la carte à deviner
    println("La carte à deviner était le ${jeu.carteADeviner}")

    // TODO (challenge-4) la stratégie de jeu est à implémenter... à faire lorsque les autres TODOs auront été réalisés
    //println("Votre stratégie de jeu : ${jeu.strategiePartie()} ")

    println(" ==== Fin de la partie. ====")
}
