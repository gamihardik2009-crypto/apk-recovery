package androidx.lifecycle;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463l {
    public static EnumC0465n a(EnumC0466o enumC0466o) {
        z2.h.f(enumC0466o, "state");
        int ordinal = enumC0466o.ordinal();
        if (ordinal == 2) {
            return EnumC0465n.ON_DESTROY;
        }
        if (ordinal == 3) {
            return EnumC0465n.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return EnumC0465n.ON_PAUSE;
    }

    public static EnumC0465n b(EnumC0466o enumC0466o) {
        z2.h.f(enumC0466o, "state");
        int ordinal = enumC0466o.ordinal();
        if (ordinal == 1) {
            return EnumC0465n.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0465n.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0465n.ON_RESUME;
    }
}
