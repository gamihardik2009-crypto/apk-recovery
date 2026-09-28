package v;

/* renamed from: v.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341M extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11295i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1343O f11296j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1341M(C1343O c1343o, int i2) {
        super(1);
        this.f11295i = i2;
        this.f11296j = c1343o;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f11295i) {
            case 0:
                x xVar = (x) this.f11296j.f11302u.c();
                int a3 = xVar.a();
                int i2 = 0;
                while (true) {
                    if (i2 >= a3) {
                        i2 = -1;
                    } else if (!z2.h.a(xVar.b(i2), obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Number) obj).intValue();
                C1343O c1343o = this.f11296j;
                x xVar2 = (x) c1343o.f11302u.c();
                if (intValue >= 0 && intValue < xVar2.a()) {
                    J2.B.r(c1343o.y0(), null, 0, new C1342N(c1343o, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder l3 = B1.t.l("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                l3.append(xVar2.a());
                l3.append(')');
                throw new IllegalArgumentException(l3.toString().toString());
        }
    }
}
