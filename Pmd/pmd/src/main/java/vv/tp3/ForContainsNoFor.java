package vv.tp3;

import net.sourceforge.pmd.lang.java.ast.*;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;

public class ForContainsNoFor extends AbstractJavaRule {

    public Object visit(ASTForStatement node, Object data) {
        if (node.getParentsOfType(ASTForStatement.class)!=null) {
            //ajout de la violation
            addViolation(data, node);
        }
        return super.visit(node,data);
    }
}
