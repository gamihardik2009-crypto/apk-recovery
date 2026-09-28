package W1;

import J.InterfaceC0258c0;
import a.AbstractC0423a;
import android.content.Context;
import c.C0556f;
import m2.C0880v;

/* renamed from: W1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0385f implements y2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6024h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6025i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6026j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6027k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6028l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6029m;

    public /* synthetic */ C0385f(Context context, P p3, C0556f c0556f, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02) {
        this.f6027k = context;
        this.f6028l = p3;
        this.f6029m = c0556f;
        this.f6025i = interfaceC0258c0;
        this.f6026j = interfaceC0258c02;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f6024h) {
            case 0:
                y2.f fVar = (y2.f) this.f6027k;
                z2.h.f(fVar, "$onSave");
                InterfaceC0258c0 interfaceC0258c0 = this.f6025i;
                z2.h.f(interfaceC0258c0, "$phone$delegate");
                InterfaceC0258c0 interfaceC0258c02 = this.f6026j;
                z2.h.f(interfaceC0258c02, "$error$delegate");
                InterfaceC0258c0 interfaceC0258c03 = (InterfaceC0258c0) this.f6028l;
                z2.h.f(interfaceC0258c03, "$name$delegate");
                InterfaceC0258c0 interfaceC0258c04 = (InterfaceC0258c0) this.f6029m;
                z2.h.f(interfaceC0258c04, "$useName$delegate");
                if (H2.l.V((String) interfaceC0258c0.getValue())) {
                    interfaceC0258c02.setValue("Mobile number is mandatory");
                } else {
                    String str = (String) interfaceC0258c03.getValue();
                    String str2 = (String) interfaceC0258c0.getValue();
                    Boolean bool = (Boolean) interfaceC0258c04.getValue();
                    bool.booleanValue();
                    fVar.i(str, str2, bool);
                }
                break;
            default:
                Context context = (Context) this.f6027k;
                z2.h.f(context, "$context");
                P p3 = (P) this.f6028l;
                z2.h.f(p3, "$viewModel");
                C0556f c0556f = (C0556f) this.f6029m;
                z2.h.f(c0556f, "$contactPermissionLauncher");
                InterfaceC0258c0 interfaceC0258c05 = this.f6025i;
                z2.h.f(interfaceC0258c05, "$showFabMenu$delegate");
                InterfaceC0258c0 interfaceC0258c06 = this.f6026j;
                z2.h.f(interfaceC0258c06, "$showContactPicker$delegate");
                interfaceC0258c05.setValue(Boolean.FALSE);
                if (AbstractC0423a.D(context, "android.permission.READ_CONTACTS") == 0) {
                    J2.B.r(androidx.lifecycle.Q.j(p3), null, 0, new M(p3, context, null), 3);
                    interfaceC0258c06.setValue(Boolean.TRUE);
                } else {
                    c0556f.R("android.permission.READ_CONTACTS");
                }
                break;
        }
        return C0880v.f8657a;
    }

    public /* synthetic */ C0385f(y2.f fVar, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03, InterfaceC0258c0 interfaceC0258c04) {
        this.f6027k = fVar;
        this.f6025i = interfaceC0258c0;
        this.f6026j = interfaceC0258c02;
        this.f6028l = interfaceC0258c03;
        this.f6029m = interfaceC0258c04;
    }
}
