package com.ascend.training.j4qa.basicsyntax.phone;

public class HuaweiFactory {

    public static SmartphoneInterface createSmartPhone(String modelName) {
        if (modelName.equals("P9")) {
            return new HuaweiP9();
        }

        throw new IllegalArgumentException("Model '" + modelName + "' not supported");
    }

}
