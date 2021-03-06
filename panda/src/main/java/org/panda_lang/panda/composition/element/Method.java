package org.panda_lang.panda.composition.element;

import org.panda_lang.core.work.element.HeadWrapper;

public class Method extends Block implements HeadWrapper {

    private final String methodName;

    public Method(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    @Override
    public String getType() {
        return "method";
    }

}
