package E2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1075b;

    public a(float f3, float f4) {
        this.f1074a = f3;
        this.f1075b = f4;
    }

    public static boolean b(Float f3, Float f4) {
        return f3.floatValue() <= f4.floatValue();
    }

    public final boolean a() {
        return this.f1074a > this.f1075b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!a() || !((a) obj).a()) {
                a aVar = (a) obj;
                if (this.f1074a != aVar.f1074a || this.f1075b != aVar.f1075b) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.hashCode(this.f1074a) * 31) + Float.hashCode(this.f1075b);
    }

    public final String toString() {
        return this.f1074a + ".." + this.f1075b;
    }
}
