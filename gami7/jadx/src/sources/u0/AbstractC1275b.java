package u0;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1275b {

    /* renamed from: a, reason: collision with root package name */
    public String f11028a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f11029b = new int[2];

    public abstract int[] a(int i2);

    public final int[] b(int i2, int i3) {
        if (i2 < 0 || i3 < 0 || i2 == i3) {
            return null;
        }
        int[] iArr = this.f11029b;
        iArr[0] = i2;
        iArr[1] = i3;
        return iArr;
    }

    public final String c() {
        String str = this.f11028a;
        if (str != null) {
            return str;
        }
        z2.h.j("text");
        throw null;
    }

    public abstract int[] d(int i2);
}
