package W1;

import J.InterfaceC0258c0;
import m2.C0880v;

/* renamed from: W1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0388i implements y2.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6039i;

    public /* synthetic */ C0388i(InterfaceC0258c0 interfaceC0258c0, int i2) {
        this.f6038h = i2;
        this.f6039i = interfaceC0258c0;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f6038h) {
            case 0:
                String str = (String) obj;
                InterfaceC0258c0 interfaceC0258c0 = this.f6039i;
                z2.h.f(interfaceC0258c0, "$name$delegate");
                z2.h.f(str, "it");
                interfaceC0258c0.setValue(str);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                InterfaceC0258c0 interfaceC0258c02 = this.f6039i;
                z2.h.f(interfaceC0258c02, "$useName$delegate");
                interfaceC0258c02.setValue(bool);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                InterfaceC0258c0 interfaceC0258c03 = this.f6039i;
                z2.h.f(interfaceC0258c03, "$skipSundays$delegate");
                interfaceC0258c03.setValue(bool2);
                break;
            case 3:
                String str2 = (String) obj;
                InterfaceC0258c0 interfaceC0258c04 = this.f6039i;
                z2.h.f(interfaceC0258c04, "$title$delegate");
                z2.h.f(str2, "it");
                interfaceC0258c04.setValue(str2);
                break;
            case 4:
                String str3 = (String) obj;
                InterfaceC0258c0 interfaceC0258c05 = this.f6039i;
                z2.h.f(interfaceC0258c05, "$greeting$delegate");
                z2.h.f(str3, "it");
                interfaceC0258c05.setValue(str3);
                break;
            default:
                String str4 = (String) obj;
                InterfaceC0258c0 interfaceC0258c06 = this.f6039i;
                z2.h.f(interfaceC0258c06, "$message$delegate");
                z2.h.f(str4, "it");
                interfaceC0258c06.setValue(str4);
                break;
        }
        return C0880v.f8657a;
    }
}
