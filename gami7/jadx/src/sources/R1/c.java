package R1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final c f5483h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f5484i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f5485j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ c[] f5486k;

    static {
        c cVar = new c("SENT", 0);
        f5483h = cVar;
        c cVar2 = new c("FAILED", 1);
        f5484i = cVar2;
        c cVar3 = new c("PENDING", 2);
        f5485j = cVar3;
        f5486k = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5486k.clone();
    }
}
