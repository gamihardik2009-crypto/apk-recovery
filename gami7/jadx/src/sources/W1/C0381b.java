package W1;

import J.C0257c;
import J.C0285q;
import a.AbstractC0423a;
import m2.C0880v;

/* renamed from: W1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0381b implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6010h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6011i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6012j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6013k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6014l;

    public /* synthetic */ C0381b(U u3, boolean z3, y2.a aVar, int i2) {
        this.f6013k = u3;
        this.f6011i = z3;
        this.f6014l = aVar;
        this.f6012j = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f6010h;
        C0285q c0285q = (C0285q) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                U u3 = (U) this.f6013k;
                z2.h.f(u3, "$contact");
                y2.a aVar = (y2.a) this.f6014l;
                z2.h.f(aVar, "$onToggle");
                AbstractC0423a.i(u3, this.f6011i, aVar, c0285q, C0257c.Y(this.f6012j | 1));
                break;
            default:
                y2.c cVar = (y2.c) this.f6013k;
                z2.h.f(cVar, "$onToggle");
                R1.a aVar2 = (R1.a) this.f6014l;
                z2.h.f(aVar2, "$settings");
                K1.f.b(this.f6011i, cVar, aVar2, c0285q, C0257c.Y(this.f6012j | 1));
                break;
        }
        return C0880v.f8657a;
    }

    public /* synthetic */ C0381b(boolean z3, y2.c cVar, R1.a aVar, int i2) {
        this.f6011i = z3;
        this.f6013k = cVar;
        this.f6014l = aVar;
        this.f6012j = i2;
    }
}
