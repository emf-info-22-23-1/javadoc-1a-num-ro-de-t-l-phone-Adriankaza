package ch.emf.atelierpo.wrk;


/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {


    /**
     * Cette méthode va contrôler si le numéro mobile entrée est valide suivant les différentes normes demandés
     * @param prefix Pour avoir un numéro de téléphone valide, il faut avoir exactement un de ses préfixes "+4176, +4177, +4178 et +4179". Si 
     * le préfixe n'est pas égal à un de ceux-ci, alors la méthode retournera la valeur false.
     * @param numero Pour avoir un numéro de téléphone valide, il faut suivre la norme d'un suite de 7 caractères aux formats : "xxx xx xx", les seuls caractères autorisés
     * sont les caractère 0-9 et les espaces. Si le numéro ne suit pas cette norme alors la méthode retournera la valeur false.
     * @return retour d'un boolean true ou false selon les spécifications du préfix et du numéro
     */
    
    public boolean controleNumeroTelMobile(String prefix, String numero) {
        return false;
    }

}
