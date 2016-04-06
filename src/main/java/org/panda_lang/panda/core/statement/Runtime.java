package org.panda_lang.panda.core.statement;

import org.panda_lang.panda.core.Alice;
import org.panda_lang.panda.core.Essence;

public class Runtime implements Executable {

    private Factor instance;
    private Executable executable;
    private Factor[] factors;
    private Equality equality;
    private Method method;
    private Math math;

    public Runtime() {
    }

    public Runtime(Equality equality) {
        this.equality = equality;
    }

    public Runtime(Method method) {
        this.method = method;
    }

    public Runtime(Math math) {
        this.math = math;
    }

    public Runtime(Factor instance, Executable executable, Factor[] factors) {
        this.instance = instance;
        this.executable = executable;
        this.factors = factors;
    }

    @Override
    public Essence run(Alice alice) {
        alice.setInstance(instance);
        alice.setFactors(factors);
        if (method != null) {
            return method.run(alice);
        }
        else if (math != null) {
            return math.run(alice);
        }
        else if (equality != null) {
            return equality.run(alice);
        }
        else if (executable != null) {
            return executable.run(alice);
        }
        return null;
    }

    public void setInstance(Factor instance) {
        this.instance = instance;
    }

    public void setExecutable(Executable executable) {
        this.executable = executable;
    }

    public void setFactors(Factor[] factors) {
        this.factors = factors;
    }

    public void setEquality(Equality equality) {
        this.equality = equality;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public void setMath(Math math) {
        this.math = math;
    }

}