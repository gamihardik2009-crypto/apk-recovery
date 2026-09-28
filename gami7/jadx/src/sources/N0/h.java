package N0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final h f4989h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f4990i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ h[] f4991j;

    static {
        h hVar = new h("Ltr", 0);
        f4989h = hVar;
        h hVar2 = new h("Rtl", 1);
        f4990i = hVar2;
        f4991j = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f4991j.clone();
    }
}
