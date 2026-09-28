package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0466o {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0466o f6898h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0466o f6899i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0466o f6900j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0466o f6901k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0466o f6902l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0466o[] f6903m;

    static {
        EnumC0466o enumC0466o = new EnumC0466o("DESTROYED", 0);
        f6898h = enumC0466o;
        EnumC0466o enumC0466o2 = new EnumC0466o("INITIALIZED", 1);
        f6899i = enumC0466o2;
        EnumC0466o enumC0466o3 = new EnumC0466o("CREATED", 2);
        f6900j = enumC0466o3;
        EnumC0466o enumC0466o4 = new EnumC0466o("STARTED", 3);
        f6901k = enumC0466o4;
        EnumC0466o enumC0466o5 = new EnumC0466o("RESUMED", 4);
        f6902l = enumC0466o5;
        f6903m = new EnumC0466o[]{enumC0466o, enumC0466o2, enumC0466o3, enumC0466o4, enumC0466o5};
    }

    public static EnumC0466o valueOf(String str) {
        return (EnumC0466o) Enum.valueOf(EnumC0466o.class, str);
    }

    public static EnumC0466o[] values() {
        return (EnumC0466o[]) f6903m.clone();
    }
}
