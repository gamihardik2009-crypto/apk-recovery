package androidx.lifecycle;

import s.AbstractC1166e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0465n {
    private static final /* synthetic */ EnumC0465n[] $VALUES;
    public static final C0463l Companion;
    public static final EnumC0465n ON_ANY;
    public static final EnumC0465n ON_CREATE;
    public static final EnumC0465n ON_DESTROY;
    public static final EnumC0465n ON_PAUSE;
    public static final EnumC0465n ON_RESUME;
    public static final EnumC0465n ON_START;
    public static final EnumC0465n ON_STOP;

    static {
        EnumC0465n enumC0465n = new EnumC0465n("ON_CREATE", 0);
        ON_CREATE = enumC0465n;
        EnumC0465n enumC0465n2 = new EnumC0465n("ON_START", 1);
        ON_START = enumC0465n2;
        EnumC0465n enumC0465n3 = new EnumC0465n("ON_RESUME", 2);
        ON_RESUME = enumC0465n3;
        EnumC0465n enumC0465n4 = new EnumC0465n("ON_PAUSE", 3);
        ON_PAUSE = enumC0465n4;
        EnumC0465n enumC0465n5 = new EnumC0465n("ON_STOP", 4);
        ON_STOP = enumC0465n5;
        EnumC0465n enumC0465n6 = new EnumC0465n("ON_DESTROY", 5);
        ON_DESTROY = enumC0465n6;
        EnumC0465n enumC0465n7 = new EnumC0465n("ON_ANY", 6);
        ON_ANY = enumC0465n7;
        $VALUES = new EnumC0465n[]{enumC0465n, enumC0465n2, enumC0465n3, enumC0465n4, enumC0465n5, enumC0465n6, enumC0465n7};
        Companion = new C0463l();
    }

    public static EnumC0465n valueOf(String str) {
        return (EnumC0465n) Enum.valueOf(EnumC0465n.class, str);
    }

    public static EnumC0465n[] values() {
        return (EnumC0465n[]) $VALUES.clone();
    }

    public final EnumC0466o a() {
        switch (AbstractC0464m.f6897a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0466o.f6900j;
            case 3:
            case 4:
                return EnumC0466o.f6901k;
            case AbstractC1166e.f10138f /* 5 */:
                return EnumC0466o.f6902l;
            case AbstractC1166e.f10136d /* 6 */:
                return EnumC0466o.f6898h;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
