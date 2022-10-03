package org.sio.slam.devine.fabrique

import org.sio.slam.devine.core.Carte
import org.sio.slam.devine.enum.CouleurCarte
import org.sio.slam.devine.enum.NomCarte

/*** Création d'un paquet de 32 cartes ***/
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
        Carte(NomCarte.AS,CouleurCarte.TREFLE)

    )
}

fun createJeu52Cartes() : List<Carte>
{
    return listOf(
        Carte(NomCarte.DEUX, CouleurCarte.COEUR),
        Carte(NomCarte.TROIS, CouleurCarte.COEUR),
        Carte(NomCarte.QUATRE, CouleurCarte.COEUR),
        Carte(NomCarte.CINQ, CouleurCarte.COEUR),
        Carte(NomCarte.SIX, CouleurCarte.COEUR),
        Carte(NomCarte.SEPT, CouleurCarte.COEUR),
        Carte(NomCarte.HUIT, CouleurCarte.COEUR),
        Carte(NomCarte.NEUF, CouleurCarte.COEUR),
        Carte(NomCarte.DIX, CouleurCarte.COEUR),
        Carte(NomCarte.VALET, CouleurCarte.COEUR),
        Carte(NomCarte.DAME, CouleurCarte.COEUR),
        Carte(NomCarte.ROI, CouleurCarte.COEUR),
        Carte(NomCarte.AS, CouleurCarte.COEUR),
        Carte(NomCarte.DEUX, CouleurCarte.PIQUE),
        Carte(NomCarte.TROIS, CouleurCarte.PIQUE),
        Carte(NomCarte.QUATRE, CouleurCarte.PIQUE),
        Carte(NomCarte.CINQ, CouleurCarte.PIQUE),
        Carte(NomCarte.SIX, CouleurCarte.PIQUE),
        Carte(NomCarte.SEPT, CouleurCarte.PIQUE),
        Carte(NomCarte.HUIT, CouleurCarte.PIQUE),
        Carte(NomCarte.NEUF, CouleurCarte.PIQUE),
        Carte(NomCarte.DIX, CouleurCarte.PIQUE),
        Carte(NomCarte.VALET, CouleurCarte.PIQUE),
        Carte(NomCarte.DAME, CouleurCarte.PIQUE),
        Carte(NomCarte.ROI, CouleurCarte.PIQUE),
        Carte(NomCarte.AS, CouleurCarte.PIQUE),
        Carte(NomCarte.DEUX, CouleurCarte.TREFLE),
        Carte(NomCarte.TROIS, CouleurCarte.TREFLE),
        Carte(NomCarte.QUATRE, CouleurCarte.TREFLE),
        Carte(NomCarte.CINQ, CouleurCarte.TREFLE),
        Carte(NomCarte.SIX, CouleurCarte.TREFLE),
        Carte(NomCarte.SEPT, CouleurCarte.TREFLE),
        Carte(NomCarte.HUIT, CouleurCarte.TREFLE),
        Carte(NomCarte.NEUF, CouleurCarte.TREFLE),
        Carte(NomCarte.DIX, CouleurCarte.TREFLE),
        Carte(NomCarte.VALET, CouleurCarte.TREFLE),
        Carte(NomCarte.DAME, CouleurCarte.TREFLE),
        Carte(NomCarte.ROI, CouleurCarte.TREFLE),
        Carte(NomCarte.AS, CouleurCarte.TREFLE),
        Carte(NomCarte.DEUX, CouleurCarte.CARREAU),
        Carte(NomCarte.TROIS, CouleurCarte.CARREAU),
        Carte(NomCarte.QUATRE, CouleurCarte.CARREAU),
        Carte(NomCarte.CINQ, CouleurCarte.CARREAU),
        Carte(NomCarte.SIX, CouleurCarte.CARREAU),
        Carte(NomCarte.SEPT, CouleurCarte.CARREAU),
        Carte(NomCarte.HUIT, CouleurCarte.CARREAU),
        Carte(NomCarte.NEUF, CouleurCarte.CARREAU),
        Carte(NomCarte.DIX, CouleurCarte.CARREAU),
        Carte(NomCarte.VALET, CouleurCarte.CARREAU),
        Carte(NomCarte.DAME, CouleurCarte.CARREAU),
        Carte(NomCarte.ROI, CouleurCarte.CARREAU),
        Carte(NomCarte.AS, CouleurCarte.CARREAU)
        )
}