package H;

import C0.C0024g;
import J.InterfaceC0258c0;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Locale;
import m2.C0880v;

/* renamed from: H.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207v0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0189s0 f3206i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f3207j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.c f3208k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f3209l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A0 f3210m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3211n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Locale f3212o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f3213p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0207v0(C0189s0 c0189s0, InterfaceC0258c0 interfaceC0258c0, y2.c cVar, I i2, A0 a02, int i3, Locale locale, InterfaceC0258c0 interfaceC0258c02) {
        super(1);
        this.f3206i = c0189s0;
        this.f3207j = interfaceC0258c0;
        this.f3208k = cVar;
        this.f3209l = i2;
        this.f3210m = a02;
        this.f3211n = i3;
        this.f3212o = locale;
        this.f3213p = interfaceC0258c02;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        H h2;
        I0.z zVar = (I0.z) obj;
        int length = zVar.f3932a.f500a.length();
        C0189s0 c0189s0 = this.f3206i;
        if (length <= c0189s0.f3075c.length()) {
            C0024g c0024g = zVar.f3932a;
            String str = c0024g.f500a;
            int i2 = 0;
            while (true) {
                if (i2 >= str.length()) {
                    this.f3213p.setValue(zVar);
                    String obj2 = H2.l.h0(c0024g.f500a).toString();
                    int length2 = obj2.length();
                    String str2 = "";
                    y2.c cVar = this.f3208k;
                    InterfaceC0258c0 interfaceC0258c0 = this.f3207j;
                    Long l3 = null;
                    if (length2 != 0) {
                        int length3 = obj2.length();
                        String str3 = c0189s0.f3075c;
                        if (length3 >= str3.length()) {
                            ((J) this.f3209l).getClass();
                            try {
                                LocalDate parse = LocalDate.parse(obj2, DateTimeFormatter.ofPattern(str3));
                                h2 = new H(parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth(), parse.atTime(LocalTime.MIDNIGHT).atZone(J.f1611d).toInstant().toEpochMilli());
                            } catch (DateTimeParseException unused) {
                                h2 = null;
                            }
                            A0 a02 = this.f3210m;
                            if (h2 == null) {
                                String upperCase = a02.f1281c.f3073a.toUpperCase(Locale.ROOT);
                                z2.h.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                str2 = String.format(a02.f1283e, Arrays.copyOf(new Object[]{upperCase}, 1));
                            } else {
                                E2.d dVar = a02.f1279a;
                                if (dVar.a(h2.f1544h)) {
                                    InterfaceC0180q3 interfaceC0180q3 = a02.f1280b;
                                    interfaceC0180q3.getClass();
                                    long j3 = h2.f1547k;
                                    if (!interfaceC0180q3.a(j3)) {
                                        str2 = String.format(a02.f1285g, Arrays.copyOf(new Object[]{a02.f1282d.a(Long.valueOf(j3), this.f3212o, false)}, 1));
                                    } else if (this.f3211n == 1) {
                                        Long l4 = a02.f1286h;
                                        int i3 = (j3 > (l4 != null ? l4.longValue() : Long.MAX_VALUE) ? 1 : (j3 == (l4 != null ? l4.longValue() : Long.MAX_VALUE) ? 0 : -1));
                                    }
                                } else {
                                    str2 = String.format(a02.f1284f, Arrays.copyOf(new Object[]{AbstractC0064a.a(dVar.f1076h, 0, 7), AbstractC0064a.a(dVar.f1077i, 0, 7)}, 2));
                                }
                            }
                            interfaceC0258c0.setValue(str2);
                            if (((CharSequence) interfaceC0258c0.getValue()).length() == 0 && h2 != null) {
                                l3 = Long.valueOf(h2.f1547k);
                            }
                            cVar.l(l3);
                        }
                    }
                    interfaceC0258c0.setValue("");
                    cVar.l(null);
                } else {
                    if (!Character.isDigit(str.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return C0880v.f8657a;
    }
}
