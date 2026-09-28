package q2;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071b extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final C1071b f9777j = new C1071b(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1071b f9778k = new C1071b(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9779i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1071b(int i2, int i3) {
        super(i2);
        this.f9779i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C1072c c1072c;
        switch (this.f9779i) {
            case 0:
                String str = (String) obj;
                InterfaceC1076g interfaceC1076g = (InterfaceC1076g) obj2;
                z2.h.f(str, "acc");
                z2.h.f(interfaceC1076g, "element");
                if (str.length() == 0) {
                    return interfaceC1076g.toString();
                }
                return str + ", " + interfaceC1076g;
            default:
                InterfaceC1078i interfaceC1078i = (InterfaceC1078i) obj;
                InterfaceC1076g interfaceC1076g2 = (InterfaceC1076g) obj2;
                z2.h.f(interfaceC1078i, "acc");
                z2.h.f(interfaceC1076g2, "element");
                InterfaceC1078i h2 = interfaceC1078i.h(interfaceC1076g2.getKey());
                C1079j c1079j = C1079j.f9784h;
                if (h2 == c1079j) {
                    return interfaceC1076g2;
                }
                C1074e c1074e = C1074e.f9782h;
                InterfaceC1075f interfaceC1075f = (InterfaceC1075f) h2.s(c1074e);
                if (interfaceC1075f == null) {
                    c1072c = new C1072c(interfaceC1076g2, h2);
                } else {
                    InterfaceC1078i h3 = h2.h(c1074e);
                    if (h3 == c1079j) {
                        return new C1072c(interfaceC1075f, interfaceC1076g2);
                    }
                    c1072c = new C1072c(interfaceC1075f, new C1072c(interfaceC1076g2, h3));
                }
                return c1072c;
        }
    }
}
