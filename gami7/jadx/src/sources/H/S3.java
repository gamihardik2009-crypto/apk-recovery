package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import n2.AbstractC0962n;
import o.AbstractC0990p;
import o.C0976b;
import r0.AbstractC1108W;
import r0.C1111Z;
import s.AbstractC1166e;
import v.C1334F;

/* loaded from: classes.dex */
public final class S3 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1983i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1984j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1985k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1987m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1988n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(Object obj, int i2, C1334F c1334f, y2.e eVar, int i3) {
        super(2);
        this.f1983i = 7;
        this.f1988n = obj;
        this.f1986l = i2;
        this.f1984j = c1334f;
        this.f1985k = eVar;
        this.f1987m = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f1983i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f1986l | 1);
                y2.f fVar = (y2.f) this.f1985k;
                D1.c((W3) this.f1988n, (V.o) this.f1984j, fVar, (C0285q) obj, Y2, this.f1987m);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f1986l | 1);
                V.o oVar = (V.o) this.f1984j;
                y2.f fVar2 = (y2.f) this.f1985k;
                D1.i((Z3) this.f1988n, oVar, fVar2, (C0285q) obj, Y3, this.f1987m);
                break;
            case 2:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f1986l | 1);
                V.o oVar2 = (V.o) this.f1984j;
                u5 u5Var = (u5) this.f1985k;
                K5.b((M5) this.f1988n, oVar2, u5Var, (C0285q) obj, Y4, this.f1987m);
                break;
            case 3:
                ((Number) obj2).intValue();
                int Y5 = C0257c.Y(this.f1986l | 1);
                R0.s sVar = (R0.s) this.f1984j;
                y2.e eVar = (y2.e) this.f1985k;
                C1.y.b((y2.a) this.f1988n, sVar, eVar, (C0285q) obj, Y5, this.f1987m);
                break;
            case 4:
                ((Number) obj2).intValue();
                int Y6 = C0257c.Y(this.f1986l | 1);
                V.o oVar3 = (V.o) this.f1984j;
                y2.f fVar3 = (y2.f) this.f1985k;
                AbstractC0990p.a((C0976b) this.f1988n, oVar3, fVar3, (C0285q) obj, Y6, this.f1987m);
                break;
            case AbstractC1166e.f10138f /* 5 */:
                ((Number) obj2).intValue();
                int Y7 = C0257c.Y(this.f1986l | 1);
                V.o oVar4 = (V.o) this.f1984j;
                y2.e eVar2 = (y2.e) this.f1985k;
                AbstractC1108W.c((C1111Z) this.f1988n, oVar4, eVar2, (C0285q) obj, Y7, this.f1987m);
                break;
            case AbstractC1166e.f10136d /* 6 */:
                ((Number) obj2).intValue();
                int Y8 = C0257c.Y(this.f1987m | 1);
                int i2 = this.f1986l;
                Object obj3 = this.f1985k;
                AbstractC0962n.a((v.x) this.f1988n, this.f1984j, i2, obj3, (C0285q) obj, Y8);
                break;
            default:
                ((Number) obj2).intValue();
                int Y9 = C0257c.Y(this.f1987m | 1);
                C1334F c1334f = (C1334F) this.f1984j;
                y2.e eVar3 = (y2.e) this.f1985k;
                n1.E.c(this.f1988n, this.f1986l, c1334f, eVar3, (C0285q) obj, Y9);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S3(Object obj, Object obj2, Object obj3, int i2, int i3, int i4) {
        super(2);
        this.f1983i = i4;
        this.f1988n = obj;
        this.f1984j = obj2;
        this.f1985k = obj3;
        this.f1986l = i2;
        this.f1987m = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(v.x xVar, Object obj, int i2, Object obj2, int i3) {
        super(2);
        this.f1983i = 6;
        this.f1988n = xVar;
        this.f1984j = obj;
        this.f1986l = i2;
        this.f1985k = obj2;
        this.f1987m = i3;
    }
}
