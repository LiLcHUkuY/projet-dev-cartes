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
        Carte(NomCarte.DIX, CouleurCarte.PIQUE),
        Carte(NomCarte.NEUF, CouleurCarte.PIQUE),
        Carte(NomCarte.HUIT,CouleurCarte.PIQUE),
        Carte(NomCarte.SEPT, CouleurCarte.PIQUE),
        Carte(NomCarte.VALET, CouleurCarte.PIQUE),
        Carte(NomCarte.DAME, CouleurCarte.PIQUE),
        Carte(NomCarte.ROI,CouleurCarte.PIQUE),
        Carte(NomCarte.AS,CouleurCarte.PIQUE),
        Carte(NomCarte.DIX, CouleurCarte.CARREAU),
        Carte(NomCarte.NEUF, CouleurCarte.CARREAU),
        Carte(NomCarte.HUIT,CouleurCarte.CARREAU),
        Carte(NomCarte.SEPT, CouleurCarte.CARREAU),
        Carte(NomCarte.VALET, CouleurCarte.CARREAU),
        Carte(NomCarte.DAME, CouleurCarte.CARREAU),
        Carte(NomCarte.ROI,CouleurCarte.CARREAU),
        Carte(NomCarte.AS,CouleurCarte.CARREAU),
        Carte(NomCarte.DIX, CouleurCarte.COEUR),
        Carte(NomCarte.NEUF, CouleurCarte.COEUR),
        Carte(NomCarte.HUIT,CouleurCarte.COEUR),
        Carte(NomCarte.SEPT, CouleurCarte.COEUR),
        Carte(NomCarte.VALET, CouleurCarte.COEUR),
        Carte(NomCarte.DAME, CouleurCarte.COEUR),
        Carte(NomCarte.ROI,CouleurCarte.COEUR),
        Carte(NomCarte.AS,CouleurCarte.COEUR),
        Carte(NomCarte.DIX, CouleurCarte.TREFLE),
        Carte(NomCarte.NEUF, CouleurCarte.TREFLE),
        Carte(NomCarte.HUIT,CouleurCarte.TREFLE),
        Carte(NomCarte.SEPT, CouleurCarte.TREFLE),
        Carte(NomCarte.VALET, CouleurCarte.TREFLE),
        Carte(NomCarte.DAME, CouleurCarte.TREFLE),
        Carte(NomCarte.ROI,CouleurCarte.TREFLE),
        Carte(NomCarte.AS,CouleurCarte.TREFLE),

    )
}


