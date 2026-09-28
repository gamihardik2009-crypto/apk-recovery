package R0;

import D.C0043l;
import D.X;
import J.C0257c;
import J.C0285q;
import m2.C0880v;
import n2.AbstractC0946A;
import n2.AbstractC0949a;
import s.AbstractC1166e;
import t.C1212g;
import t.C1214i;
import u0.C1294k0;
import v.C1354h;
import z.N;

/* loaded from: classes.dex */
public final class q extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5423i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5424j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5425k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i2, int i3, Object obj) {
        super(2);
        this.f5423i = i3;
        this.f5425k = obj;
        this.f5424j = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f5423i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f5424j | 1);
                ((r) this.f5425k).a(Y2, (C0285q) obj);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f5424j | 1);
                ((x) this.f5425k).a(Y3, (C0285q) obj);
                break;
            case 2:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f5424j | 1);
                AbstractC0946A.a((o1.o) this.f5425k, (C0285q) obj, Y4);
                break;
            case 3:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    C1214i c1214i = (C1214i) this.f5425k;
                    C0043l c0043l = c1214i.f10241b.f10239a;
                    int i2 = this.f5424j;
                    C1354h e3 = c0043l.e(i2);
                    int i3 = i2 - e3.f11345a;
                    ((C1212g) e3.f11347c).f10238c.g(c1214i.f10242c, Integer.valueOf(i3), c0285q, 0);
                }
                break;
            case 4:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    C0043l c0043l2 = ((u.i) this.f5425k).f10694b.f10692b;
                    int i4 = this.f5424j;
                    C1354h e4 = c0043l2.e(i4);
                    ((u.f) e4.f11347c).f10687d.g(u.j.f10696a, Integer.valueOf(i4 - e4.f11345a), c0285q2, 6);
                }
                break;
            case AbstractC1166e.f10138f /* 5 */:
                ((Number) obj2).intValue();
                int Y5 = C0257c.Y(this.f5424j | 1);
                ((C1294k0) this.f5425k).a(Y5, (C0285q) obj);
                break;
            case AbstractC1166e.f10136d /* 6 */:
                ((Number) obj2).intValue();
                int Y6 = C0257c.Y(this.f5424j | 1);
                AbstractC0949a.c((y2.f) this.f5425k, (C0285q) obj, Y6);
                break;
            default:
                ((Number) obj2).intValue();
                int Y7 = C0257c.Y(this.f5424j | 1);
                N.e((X) this.f5425k, (C0285q) obj, Y7);
                break;
        }
        return C0880v.f8657a;
    }
}
