package org.sio.slam.devine.fabrique

import org.sio.slam.devine.core.Carte
import org.sio.slam.devine.enum.CouleurCarte
import org.sio.slam.devine.enum.NomCarte

/**
 * Création d'un paquet de 32 cartes
 * TODO Création d'un paquet de 32 cartes à implémenter (de 7 à AS)
 */
fun createJeu32Cartes() : List<Carte> {
    return listOf(
        Carte(NomCarte.VALET, CouleurCarte.COEUR),
        Carte(NomCarte.AS, CouleurCarte.PIQUE),
        Carte(NomCarte.DIX, CouleurCarte.CARREAU),
        Carte(NomCarte.NEUF, CouleurCarte.CARREAU),
        Carte(NomCarte.HUIT,CouleurCarte.CARREAU),
        Carte(NomCarte.SEPT, CouleurCarte.CARREAU),
        Carte(NomCarte.VALET, CouleurCarte.CARREAU),
        Carte(NomCarte.DAME, CouleurCarte.CARREAU),
        Carte(NomCarte.ROI,CouleurCarte.CARREAU),
        Carte(NomCarte.AS,CouleurCarte.CARREAU),

    )
}

// TODO Création d'un paquet de 52 cartes à implémenter (de 2 à AS)

