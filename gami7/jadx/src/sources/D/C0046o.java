package D;

/* renamed from: D.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f871a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f872b;

    /* renamed from: c, reason: collision with root package name */
    public int f873c;

    /* renamed from: d, reason: collision with root package name */
    public int f874d;

    /* renamed from: e, reason: collision with root package name */
    public Object f875e;

    public /* synthetic */ C0046o() {
    }

    public C0047p a(int i2) {
        return new C0047p(B2.a.v((C0.H) this.f875e, i2), i2, 1L);
    }

    public int b() {
        return this.f874d - this.f873c;
    }

    public int c(int i2) {
        return ((K.H) this.f875e).f4451j[this.f873c + i2];
    }

    public Object d(int i2) {
        return ((K.H) this.f875e).f4453l[this.f874d + i2];
    }

    public String toString() {
        switch (this.f871a) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i2 = this.f872b;
                sb.append(i2);
                sb.append('-');
                C0.H h2 = (C0.H) this.f875e;
                sb.append(B2.a.v(h2, i2));
                sb.append(',');
                int i3 = this.f873c;
                sb.append(i3);
                sb.append('-');
                sb.append(B2.a.v(h2, i3));
                sb.append("), prevOffset=");
                return B1.t.j(sb, this.f874d, ')');
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    public C0046o(K.H h2) {
        this.f875e = h2;
    }

    public C0046o(int i2, int i3, int i4, C0.H h2) {
        this.f872b = i2;
        this.f873c = i3;
        this.f874d = i4;
        this.f875e = h2;
    }
}
