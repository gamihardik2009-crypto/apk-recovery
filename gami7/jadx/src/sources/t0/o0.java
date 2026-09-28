package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: h, reason: collision with root package name */
    public static final o0 f10610h;

    /* renamed from: i, reason: collision with root package name */
    public static final o0 f10611i;

    /* renamed from: j, reason: collision with root package name */
    public static final o0 f10612j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ o0[] f10613k;

    static {
        o0 o0Var = new o0("ContinueTraversal", 0);
        f10610h = o0Var;
        o0 o0Var2 = new o0("SkipSubtreeAndContinueTraversal", 1);
        f10611i = o0Var2;
        o0 o0Var3 = new o0("CancelTraversal", 2);
        f10612j = o0Var3;
        f10613k = new o0[]{o0Var, o0Var2, o0Var3};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f10613k.clone();
    }
}
