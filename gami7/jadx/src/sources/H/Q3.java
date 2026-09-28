package H;

import J2.InterfaceC0310g;
import m2.C0880v;

/* loaded from: classes.dex */
public final class Q3 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1933i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W3 f1934j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q3(W3 w3, int i2) {
        super(0);
        this.f1933i = i2;
        this.f1934j = w3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f1933i) {
            case 0:
                InterfaceC0310g interfaceC0310g = this.f1934j.f2119b;
                if (interfaceC0310g.b()) {
                    interfaceC0310g.t(EnumC0125i4.f2740h);
                }
                break;
            case 1:
                InterfaceC0310g interfaceC0310g2 = this.f1934j.f2119b;
                if (interfaceC0310g2.b()) {
                    interfaceC0310g2.t(EnumC0125i4.f2741i);
                }
                break;
            default:
                InterfaceC0310g interfaceC0310g3 = this.f1934j.f2119b;
                if (interfaceC0310g3.b()) {
                    interfaceC0310g3.t(EnumC0125i4.f2740h);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
