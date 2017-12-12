# Tutoriel Git / Github

# Github
**Github** est un site web qui héberge des projets git. C'est simplement une "jolie" interface graphique qui lit le contenu du repertoire `.git` de votre projet. Ce n'est pas le seul à pouvoir faire ça (BitBucket, CloudForge, CodeBase, GitLab, ...).  
Il permet aussi de réaliser quelques commandes principales Git juste en cliquant sur des boutons (Pull, Push, Merge, Commit, Fork).

# Git
**Git** est un logiciel permettant de gérer les versions d'un projet.  
Il permet, entre autres, de pouvoir travailler à plusieurs simultanément sur un projet, de revenir a une version précédente du projet en cas de problème, etc.  

## Fonctionnement
Git doit gérer toutes les modifications de tous les fichiers de votre projet. Il va donc devoir sauvegarder tout ces changements pour vous permettre de revenir à la version qui vous interesse.  
Au lieu de sauvegarder l'intégralité du contenu de chaque fichier pour chaque version (ce qui consommerait enormement d'emplacement mémoire), il va sauvegarder seulement les différences entre chaque fichiers pour chaque version. En gros, avant de sauvegarder votre version 1.1, il va faire la commande `diff` entre votre précédente version 1.0 et votre nouvelle version 1.1, puis sauvegarder le résultat de cette commande dans le répertoire `.git`.  

## Initialisation d'un projet Git
Pour créer un projet Git tout neuf, il vous faut rentrer la commande `git init <NOM_PROJET>`.  
Si vous voulez plutôt récupérer un projet Git situé sur Github, il vous faut rentrer la commande `git clone <URL_PROJET>`.  
Par exemple si vous voulez récupérer le projet situé à l'adresse https://github.com/Zzardbli/StoneHearth, il vous suffit de faire :
```bash
git clone https://github.com/Zzardbli/StoneHearth
```

## Tracking des fichiers
Git ne traque pas automatiquement tous vos fichiers ajoutés au projet, il faut lui dire quels fichiers ajouter. La commande `git add <FICHIER>` dit a Git quel fichier traquer, elle est a lancer une fois par fichier qui sera modifié (ou qui est modifié).  
On peut voir à tout moment quels fichiers sont modifiés depuis la dernière version, et parmis ces fichiers lesquels sont traqués par Git avec la commande `git status`.  
De même, Git ne traque pas automatiquement les fichiers supprimés, il faut lui dire quel fichier supprimer. La commande `git rm --cached <FICHIER> ` dit à Git de supprimer ce fichier de la version actuelle.

## Sauvegarde d'une version
Pour sauvegarder une version, après avoir modifié vos fichiers et dit à Git de les avoir traqués, il faut sauvegarder vos changements. Cela s'appelle faire un **commit**. Pour faire un commit, il faut entrer la commande `git commit -m <MESSAGE>`. Le message passé en paramètre sert à expliquer ce que vous avez fait. Il est obligatoire.

## Les branches
Git fonctionne sous forme de branches. La branche principale s'appelle **master**, c'est là où se trouve le code du projet qui fonctionne parfaitement. Pour tester des trucs, ou pour commencer à implanter une nouvelle fonctionnalité dans le code de master, on doit crééer une nouvelle branche.  
Après avoir effectué nos modifications sur cette nouvelle branche, il faut la fusionner avec master. C'est cette fusion qui est essentielle au principe de travail simultané. En effet, si la fusion se passe bien (c'est à dire que vous avez fait des modifications sur votre branche, et que personne d'autre n'a fait des modifications sur des lignes similaires), alors tout ira bien et git ajoutera automatiquement tous vos commits sur la branche master. Il vous proposera par la suite de supprimer la branche que vous avez créé (vous pouvez la garder si vous en avez encore besoin).  
Cependant, si l'un de vos collègues a modifié du code au même endroit que vous, alors il y'aura un conflit lors de la fusion. Dans ce cas Git vous préviendra et vous aidera a les résoudre. Vous pouvez aussi focer la fusion, dans ce cas Git ajoutera les deux versions (la votre et celle de votre collègue) dans le fichier en conflit.

## Récupèrer la dernière version depuis Github
Si vous désirez récupérer la dernière version de votre projet ou simplement vérifier que votre version locale est à jour, il vous faut rentrer la commande `git pull origin master`. Cette commande ajoute a la branche origin (la branche située localement sur votre ordinateur) le contenu de la branche master.  

