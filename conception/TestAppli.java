package test;


import static org.junit.Assert.*;

public class TestAppli {

    @Test
    public void testAcheterCarte() {

    }


    @Test
    public void testAcheterEmplacementDeckPack() {
        String pseudo = "super_eve_du_18";
        String motDePasse = "MonSuperMotDePasse";

        // Initialisation des lignes de vies
        IInfoCompte infoCompte = ComposantFactory.createInfoCompte(pseudo, motDePasse);
        IPaiement paiement = ComposantFactory.createPaiement();
        IInfoJoueur infoJoueur = ComposantFactory.createInfoJoueur();

        infoCompte.setIsConnected(true);
        infoCompte.acheterEmplacementDeckPack();
    }


    @Test
    public void testAjouterCoordonneesBancaires() {

    }


    @Test
    public void testComposerDeck() {

    }


    @Test
    public void testDetruireCarte() {

    }


    @Test
    public void testInscription() {

    }


    @Test
    public void testJouer() {

    }


    @Test
    public void testSeConnecter() {
        String pseudo = "Cedric23";
        String motDePasse = "soleil";

        // Initialisation des lignes de vies
        IInfoCompte infoCompte = ComposantFactory.createInfoCompte(pseudo, motDePasse);

        if (infoCompte.verifierPseudoMotDePasse(pseudo, motDePasse)) {
            if !(infoCompte.getIsConnected()) {
                infoCompte.setIsConnected(true);
            }
        }
    }


    @Test
    public void testSeDeconnecter() {
        String pseudo = "Cedric23";
        String motDePasse = "soleil";

        // Initialisation des lignes de vies
        IInfoCompte infoCompte = ComposantFactory.createInfoCompte(pseudo, motDePasse);

        if (infoCompte.getIsConnected()) {
            infoCompte.setIsConnected(false);
        }
    }


    @Test
    public void testOuvrirPack() {
        String pseudo = "VivienLeGuerrierDu75";
        String motDePasse = "soleil";

        // Initialisation des lignes de vies
        IInfoCompte infoCompte = ComposantFactory.createInfoCompte(pseudo, motDePasse);
        IInfoJoueur infoJoueur = ComposantFactory.createInfoJoueur();

        if (infoJoueur.getNumberOfPacks() > 0) {
            // TODO: Ouvrir le pack

            infoJoueur.decrementerCompteurPacks();
        }
    }
}
