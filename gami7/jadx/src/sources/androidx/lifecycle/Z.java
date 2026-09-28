package androidx.lifecycle;

import k1.C0784b;
import n2.AbstractC0960l;

/* loaded from: classes.dex */
public interface Z {
    default X a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default X b(Class cls, C0784b c0784b) {
        return a(cls);
    }

    default X c(z2.d dVar, C0784b c0784b) {
        return b(AbstractC0960l.i(dVar), c0784b);
    }
}
