package test;


import static org.junit.Assert.*;

public class TestAppli {

    @Test
    public void testAcheterCarte() {
        //ligne de vie
		IPaiement ip = ComposantFactory.createCPaienment();
		ICarte iCarte = ComposantFactory.createCCarte();
		
		String[] listeCarte = iCarte.listerCartes();
		System.out.println(listeCarte);
		String nomCarte = listeCarte[3];
		String info = iCarte.infosCarte(nomCarte);
		
		IInfoJoueur iInfoJoueur = ComposantFactory.createCInfoJoueur(ip, iCarte);
		iInfoJoueur.acheterCarte(nomCarte);
		Integer prix = iCarte.getPrixAchat(nomCarte);
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
	//ligne de vie
	IPaiement ip = ComposantFactory.createCPaienment();
	ICarte iCarte = ComposantFactory.createCCarte();
	IInfoJoueur iInfoJoueur = ComposantFactory.createCInfoJoueur(ip, iCarte);
	IListeDeCartes coll = ComposantFactory.createCListeDeCarte();
		
	String collection = iInfoJoueur.getCollection("Bob");
		
	for (String c : coll.listerCartesListe("toto", "coll")) {
		System.out.println(c);
	}
	//le joueur clique sur la carte chat
	System.out.println(iCarte.infosCarte("chat"));
	int prix=iCarte.getPrixVente("chat");
	if(prix==0){
		System.out.println("Cette carte est basique elle ne peut pas être détruite.");
	}
	else System.out.println(prix);
		
	Set<String> retour = iInfoJoueur.destructionCarte("Bob","chat");
	if (retour.contains("true")){
		System.out.println("La destruction a été réalisée avec succès.");
		Object[] res= retour.toArray();
		System.out.println("Votre nouveau solde est de "+res[0]+" joyaux").
	}
	else System.out.println("La destruction n'a pas fonctionnée");
	

  }

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
