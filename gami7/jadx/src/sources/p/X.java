package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: h, reason: collision with root package name */
    public static final X f9518h;

    /* renamed from: i, reason: collision with root package name */
    public static final X f9519i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ X[] f9520j;

    static {
        X x2 = new X("Vertical", 0);
        f9518h = x2;
        X x3 = new X("Horizontal", 1);
        f9519i = x3;
        f9520j = new X[]{x2, x3};
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f9520j.clone();
    }
}
