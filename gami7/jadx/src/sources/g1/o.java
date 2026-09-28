package g1;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: h, reason: collision with root package name */
    public final int f7733h;

    /* renamed from: i, reason: collision with root package name */
    public int f7734i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f7735j = -1;

    public o(int i2) {
        this.f7733h = i2;
    }

    @Override // g1.n
    public final Object a() {
        return this;
    }

    @Override // g1.n
    public final boolean c(CharSequence charSequence, int i2, int i3, t tVar) {
        int i4 = this.f7733h;
        if (i2 > i4 || i4 >= i3) {
            return i3 <= i4;
        }
        this.f7734i = i2;
        this.f7735j = i3;
        return false;
    }
}
