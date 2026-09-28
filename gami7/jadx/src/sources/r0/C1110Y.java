package r0;

import J.AbstractC0288s;
import m2.C0880v;
import t0.C1236E;

/* renamed from: r0.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110Y extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9848i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1111Z f9849j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1110Y(C1111Z c1111z, int i2) {
        super(2);
        this.f9848i = i2;
        this.f9849j = c1111z;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f9848i) {
            case 0:
                this.f9849j.a().f9809i = (AbstractC0288s) obj2;
                break;
            case 1:
                C1090D a3 = this.f9849j.a();
                ((C1236E) obj).a0(new C1087A(a3, (y2.e) obj2, a3.f9822w));
                break;
            default:
                C1236E c1236e = (C1236E) obj;
                C1090D c1090d = c1236e.E;
                C1111Z c1111z = this.f9849j;
                if (c1090d == null) {
                    c1090d = new C1090D(c1236e, c1111z.f9850a);
                    c1236e.E = c1090d;
                }
                c1111z.f9851b = c1090d;
                c1111z.a().e();
                C1090D a4 = c1111z.a();
                c0 c0Var = a4.f9810j;
                c0 c0Var2 = c1111z.f9850a;
                if (c0Var != c0Var2) {
                    a4.f9810j = c0Var2;
                    a4.f(false);
                    C1236E.U(a4.f9808h, false, 7);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
