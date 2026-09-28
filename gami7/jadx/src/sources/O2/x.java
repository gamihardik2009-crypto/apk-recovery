package O2;

import q2.InterfaceC1076g;

/* loaded from: classes.dex */
public final class x extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final x f5211j = new x(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final x f5212k = new x(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final x f5213l = new x(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5214i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i2, int i3) {
        super(i2);
        this.f5214i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f5214i) {
            case 0:
                InterfaceC1076g interfaceC1076g = (InterfaceC1076g) obj2;
                if (!(interfaceC1076g instanceof y)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC1076g : Integer.valueOf(intValue + 1);
            case 1:
                y yVar = (y) obj;
                InterfaceC1076g interfaceC1076g2 = (InterfaceC1076g) obj2;
                if (yVar != null) {
                    return yVar;
                }
                if (interfaceC1076g2 instanceof y) {
                    return (y) interfaceC1076g2;
                }
                return null;
            default:
                B b3 = (B) obj;
                InterfaceC1076g interfaceC1076g3 = (InterfaceC1076g) obj2;
                if (interfaceC1076g3 instanceof y) {
                    y yVar2 = (y) interfaceC1076g3;
                    Object e3 = yVar2.e(b3.f5161a);
                    int i2 = b3.f5164d;
                    b3.f5162b[i2] = e3;
                    b3.f5164d = i2 + 1;
                    b3.f5163c[i2] = yVar2;
                }
                return b3;
        }
    }
}
