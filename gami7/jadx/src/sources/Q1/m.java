package Q1;

import B.F;
import g2.C0691b;
import g2.C0692c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public Object f5302a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5303b;

    public /* synthetic */ m(Object obj, Object obj2) {
        this.f5302a = obj;
        this.f5303b = obj2;
    }

    public List a(InputStream inputStream) {
        Charset charset = (Charset) this.f5303b;
        z2.h.e(charset, "charsetCode");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        F f3 = new F(21, inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
        C0692c c0692c = C0692c.f7775i;
        C1.b bVar = (C1.b) this.f5302a;
        bVar.getClass();
        C0691b c0691b = new C0691b(bVar, f3);
        F f4 = c0691b.f7772b;
        try {
            Object l3 = c0692c.l(c0691b);
            ((BufferedReader) ((F) f4.f165i).f165i).close();
            return (List) l3;
        } finally {
        }
    }
}
