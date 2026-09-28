package D;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import n1.C0945f;
import n2.AbstractC0948C;
import s.AbstractC1166e;
import u0.AbstractC1296l0;
import u0.C1274a0;
import v.C1346S;

/* renamed from: D.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032a extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f806i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f807j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f808k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f809l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f810m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0032a(Object obj, Object obj2, Object obj3, int i2, int i3) {
        super(2);
        this.f806i = i3;
        this.f808k = obj;
        this.f809l = obj2;
        this.f810m = obj3;
        this.f807j = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f806i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f807j | 1);
                V.c cVar = (V.c) this.f809l;
                y2.e eVar = (y2.e) this.f810m;
                K1.f.c((InterfaceC0045n) this.f808k, cVar, eVar, (C0285q) obj, Y2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f807j) | 1;
                Object obj3 = this.f809l;
                Object obj4 = this.f810m;
                ((R.a) this.f808k).b(obj3, obj4, (C0285q) obj, Y3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f807j | 1);
                Object obj5 = this.f809l;
                y2.e eVar2 = (y2.e) this.f810m;
                ((S.h) this.f808k).a(obj5, eVar2, (C0285q) obj, Y4);
                break;
            case 3:
                ((Number) obj2).intValue();
                int Y5 = C0257c.Y(this.f807j | 1);
                S.c cVar2 = (S.c) this.f809l;
                y2.e eVar3 = (y2.e) this.f810m;
                AbstractC0948C.b((C0945f) this.f808k, cVar2, eVar3, (C0285q) obj, Y5);
                break;
            case 4:
                ((Number) obj2).intValue();
                int Y6 = C0257c.Y(this.f807j | 1);
                C1274a0 c1274a0 = (C1274a0) this.f809l;
                y2.e eVar4 = (y2.e) this.f810m;
                AbstractC1296l0.a((t0.f0) this.f808k, c1274a0, eVar4, (C0285q) obj, Y6);
                break;
            case AbstractC1166e.f10138f /* 5 */:
                ((Number) obj2).intValue();
                int Y7 = C0257c.Y(this.f807j | 1);
                Object obj6 = this.f809l;
                y2.e eVar5 = (y2.e) this.f810m;
                ((C1346S) this.f808k).a(obj6, eVar5, (C0285q) obj, Y7);
                break;
            default:
                ((Number) obj2).intValue();
                int Y8 = C0257c.Y(this.f807j | 1);
                X x2 = (X) this.f809l;
                y2.e eVar6 = (y2.e) this.f810m;
                z.N.d((V.o) this.f808k, x2, eVar6, (C0285q) obj, Y8);
                break;
        }
        return C0880v.f8657a;
    }
}
