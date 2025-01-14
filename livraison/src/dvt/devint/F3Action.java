package dvt.devint;

import dvt.chasseautresor.partie.ChasseAuTresor;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * Permet de gerer l'action pour la touche "F3"
 * @author Justal Kevin
 */
public class F3Action extends AbstractAction {
    private static final long serialVersionUID = 1L;
    private transient Fenetre fenetre;
    private transient ChasseAuTresor chasseAuTresor;

    /**
     * Le constructeur appele lors de l'appuie sur la touche "F3"
     * @param fenetre La fenetre que l'on utilise
     * @author Justal Kevin
     */
    public F3Action(Fenetre fenetre) {
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        fenetre.changeColor();
    }

}
