package J;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: J.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0293u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0293u0 f4248h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0293u0 f4249i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0293u0 f4250j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0293u0 f4251k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0293u0 f4252l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0293u0 f4253m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0293u0[] f4254n;

    static {
        EnumC0293u0 enumC0293u0 = new EnumC0293u0("ShutDown", 0);
        f4248h = enumC0293u0;
        EnumC0293u0 enumC0293u02 = new EnumC0293u0("ShuttingDown", 1);
        f4249i = enumC0293u02;
        EnumC0293u0 enumC0293u03 = new EnumC0293u0("Inactive", 2);
        f4250j = enumC0293u03;
        EnumC0293u0 enumC0293u04 = new EnumC0293u0("InactivePendingWork", 3);
        f4251k = enumC0293u04;
        EnumC0293u0 enumC0293u05 = new EnumC0293u0("Idle", 4);
        f4252l = enumC0293u05;
        EnumC0293u0 enumC0293u06 = new EnumC0293u0("PendingWork", 5);
        f4253m = enumC0293u06;
        f4254n = new EnumC0293u0[]{enumC0293u0, enumC0293u02, enumC0293u03, enumC0293u04, enumC0293u05, enumC0293u06};
    }

    public static EnumC0293u0 valueOf(String str) {
        return (EnumC0293u0) Enum.valueOf(EnumC0293u0.class, str);
    }

    public static EnumC0293u0[] values() {
        return (EnumC0293u0[]) f4254n.clone();
    }
}
