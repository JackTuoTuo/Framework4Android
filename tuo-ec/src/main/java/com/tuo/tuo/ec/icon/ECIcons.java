package com.tuo.tuo.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2017/12/05
 *     desc   :
 *     version: 1.0
 * </pre>
 */


public enum ECIcons implements Icon {

    icon_scan('\ue606'),
    icon_ali_pay('\ue634');


    private char character;

    ECIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
