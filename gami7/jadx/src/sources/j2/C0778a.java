package j2;

import java.util.ArrayList;
import k2.C0785a;
import m.AbstractC0837j;
import s.AbstractC1166e;
import z2.h;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778a {

    /* renamed from: a, reason: collision with root package name */
    public int f8097a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8098b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f8099c = new StringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public long f8100d;

    public final void a() {
        ArrayList arrayList = this.f8098b;
        StringBuilder sb = this.f8099c;
        arrayList.add(sb.toString());
        h.f(sb, "<this>");
        sb.setLength(0);
    }

    public final long b(char c3, Character ch, long j3) {
        long j4 = this.f8100d;
        int d3 = AbstractC0837j.d(this.f8097a);
        StringBuilder sb = this.f8099c;
        switch (d3) {
            case 0:
                if (c3 != 65279) {
                    if (c3 == '\"') {
                        this.f8097a = 5;
                    } else if (c3 == ',') {
                        a();
                        this.f8097a = 3;
                    } else if (c3 == '\n' || c3 == 8232 || c3 == 8233 || c3 == 133) {
                        a();
                        this.f8097a = 4;
                    } else if (c3 == '\r') {
                        if (ch != null && ch.charValue() == '\n') {
                            this.f8100d++;
                        }
                        a();
                        this.f8097a = 4;
                    } else {
                        sb.append(c3);
                        this.f8097a = 2;
                    }
                }
                this.f8100d++;
                break;
            case 1:
                if (c3 == '\"') {
                    if (ch == null || ch.charValue() != '\"') {
                        throw new C0785a(j3, this.f8100d, c3, "must appear escapeChar(\") after escapeChar(\")");
                    }
                    sb.append(ch.charValue());
                    this.f8097a = 2;
                    this.f8100d++;
                } else if (c3 == ',') {
                    a();
                    this.f8097a = 3;
                } else if (c3 == '\n' || c3 == 8232 || c3 == 8233 || c3 == 133) {
                    a();
                    this.f8097a = 4;
                } else if (c3 == '\r') {
                    if (ch != null && ch.charValue() == '\n') {
                        this.f8100d++;
                    }
                    a();
                    this.f8097a = 4;
                } else {
                    sb.append(c3);
                    this.f8097a = 2;
                }
                this.f8100d++;
                break;
            case 2:
                if (c3 == '\"') {
                    this.f8097a = 5;
                } else if (c3 == ',') {
                    a();
                    this.f8097a = 3;
                } else if (c3 == '\n' || c3 == 8232 || c3 == 8233 || c3 == 133) {
                    a();
                    this.f8097a = 4;
                } else if (c3 == '\r') {
                    if (ch != null && ch.charValue() == '\n') {
                        this.f8100d++;
                    }
                    a();
                    this.f8097a = 4;
                } else {
                    sb.append(c3);
                    this.f8097a = 2;
                }
                this.f8100d++;
                break;
            case 3:
                throw new C0785a(j3, this.f8100d, c3, "unexpected error");
            case 4:
            case AbstractC1166e.f10136d /* 6 */:
                if (c3 != '\"') {
                    sb.append(c3);
                    this.f8097a = 7;
                } else if (ch != null && ch.charValue() == '\"') {
                    sb.append('\"');
                    this.f8097a = 7;
                    this.f8100d++;
                } else {
                    this.f8097a = 6;
                }
                this.f8100d++;
                break;
            case AbstractC1166e.f10138f /* 5 */:
                if (c3 == ',') {
                    a();
                    this.f8097a = 3;
                } else if (c3 == '\n' || c3 == 8232 || c3 == 8233 || c3 == 133) {
                    a();
                    this.f8097a = 4;
                } else {
                    if (c3 != '\r') {
                        throw new C0785a(j3, this.f8100d, c3, "must appear delimiter or line terminator after quote end");
                    }
                    if (ch != null && ch.charValue() == '\n') {
                        this.f8100d++;
                    }
                    a();
                    this.f8097a = 4;
                }
                this.f8100d++;
                break;
        }
        return this.f8100d - j4;
    }
}
