package a2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import n2.AbstractC0960l;

/* loaded from: classes.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j3;
        long j4 = 0;
        try {
            j3 = LocalDate.parse(H2.l.f0((String) obj, "Week ") + '/' + LocalDate.now().getYear(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).toEpochDay();
        } catch (Exception unused) {
            j3 = 0;
        }
        Long valueOf = Long.valueOf(j3);
        try {
            j4 = LocalDate.parse(H2.l.f0((String) obj2, "Week ") + '/' + LocalDate.now().getYear(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).toEpochDay();
        } catch (Exception unused2) {
        }
        return AbstractC0960l.g(valueOf, Long.valueOf(j4));
    }
}
