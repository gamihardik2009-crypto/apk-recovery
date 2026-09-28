package n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f8753h;

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f8754i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ c0[] f8755j;

    static {
        c0 c0Var = new c0("Default", 0);
        f8753h = c0Var;
        c0 c0Var2 = new c0("UserInput", 1);
        f8754i = c0Var2;
        f8755j = new c0[]{c0Var, c0Var2, new c0("PreventUserInput", 2)};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f8755j.clone();
    }
}
