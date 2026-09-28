package H;

import m2.C0880v;
import m2.InterfaceC0861c;

/* loaded from: classes.dex */
public final class P extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1869i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0861c f1870j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1871k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(y2.c cVar, boolean z3, int i2) {
        super(0);
        this.f1869i = i2;
        this.f1870j = cVar;
        this.f1871k = z3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f1869i) {
            case 0:
                ((y2.c) this.f1870j).l(Boolean.valueOf(!this.f1871k));
                break;
            case 1:
                ((y2.c) this.f1870j).l(Boolean.valueOf(!this.f1871k));
                break;
            default:
                if (this.f1871k) {
                    ((y2.a) this.f1870j).c();
                }
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(boolean z3, y2.a aVar) {
        super(0);
        this.f1869i = 2;
        this.f1871k = z3;
        this.f1870j = aVar;
    }
}
